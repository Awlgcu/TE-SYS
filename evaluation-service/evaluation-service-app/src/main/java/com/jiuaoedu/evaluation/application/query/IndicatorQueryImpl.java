package com.jiuaoedu.evaluation.application.query;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.domain.aggregate.enums.IndicatorType;
import com.jiuaoedu.evaluation.domain.gateway.repository.IndicatorRepository;
import com.jiuaoedu.evaluation.infrastructure.assembler.IndicatorAssembler;
import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 15:10
 * @version: 1.0
 */

@Service
public class IndicatorQueryImpl implements IndicatorQuery{
    @Resource
    private IndicatorRepository indicatorRepository;
    //转换器,将DO转化为DTO
    @Resource
    private IndicatorAssembler indicatorAssembler;
    @Override
    public IndicatorDTO findById(Long id) {
        Indicator indicator = indicatorRepository.findById(id).orElse(null);
        return indicatorAssembler.assemble(indicator);
    }

    @Override
    public List<IndicatorDTO> findAll() {
        List<Indicator> indicators = indicatorRepository.findAll();
        return indicatorAssembler.assembleAll(indicators);
    }

    @Override
    public List<IndicatorDTO> findByType(Integer typeIndex) {
        String type = IndicatorType.getOriginalString(typeIndex);
        List<Indicator> indicators = indicatorRepository.findByType(type);
        return indicatorAssembler.assembleAll(indicators);
    }
}
