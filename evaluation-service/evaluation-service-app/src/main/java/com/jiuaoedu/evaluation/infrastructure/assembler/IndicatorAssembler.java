package com.jiuaoedu.evaluation.infrastructure.assembler;

import com.jiuaoedu.evaluation.domain.aggregate.Indicator;
import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;
import com.jiuaoedu.share.ListToString;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:22
 * @version: 1.0
 */

@Component
public class IndicatorAssembler {
    public IndicatorDTO assemble(Indicator indicator) {
        IndicatorDTO dto = new IndicatorDTO();
        dto.setDescription(indicator.getDescription());
        dto.setType(indicator.getType().toString());
//        dto.setChoices(indicator.getChoicesString());
        dto.setChoices(ListToString.transfer(indicator.getChoices()));
        return dto;
    }
    public List<IndicatorDTO> assembleAll(List<Indicator> indicators) {
        return indicators.stream().map(indicator -> assemble(indicator)).collect(Collectors.toList());
    }

}
