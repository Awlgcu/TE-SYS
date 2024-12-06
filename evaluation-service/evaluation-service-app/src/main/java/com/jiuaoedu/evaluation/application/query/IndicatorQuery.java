package com.jiuaoedu.evaluation.application.query;

import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 15:06
 * @version: 1.0
 */

public interface IndicatorQuery {
    public IndicatorDTO findById(Long id);
    public List<IndicatorDTO> findAll();
    public List<IndicatorDTO> findByType(Integer typeIndex);
}
