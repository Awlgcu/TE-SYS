package com.jiuaoedu.evaluation.interfaces;

import com.jiuaoedu.evaluation.api.IndicatorApi;
import com.jiuaoedu.evaluation.application.IndicatorApplicationImpl;
import com.jiuaoedu.evaluation.application.query.IndicatorQueryImpl;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceCreate;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceRemove;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorCreate;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorModify;
import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;
import com.sun.istack.internal.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 15:57
 * @version: 1.0
 */
@RestController
@RequestMapping("/indicator")
@Validated
public class IndicatorController implements IndicatorApi {

    @Resource
    private IndicatorApplicationImpl indicatorApplication;
    @Resource
    private IndicatorQueryImpl indicatorQuery;

    @Override
    @PostMapping("/create")
    public void create(@RequestBody @Validated IndicatorCreate cmd) {
        indicatorApplication.addIndicator(cmd);
    }

    @PostMapping("/modify")
    @Override
    public void modify(@RequestBody @Validated IndicatorModify cmd) {
        indicatorApplication.updateIndicator(cmd);
    }

    @DeleteMapping("/delete")
    @Override
    public void delete(@RequestParam @NotNull Long id) {
        indicatorApplication.removeIndicator(id);
    }

    @GetMapping("/getAll")
    @Override
    public List<IndicatorDTO> getAll() {
        return indicatorQuery.findAll();
    }

    @GetMapping("/getOne/{id}")
    @Override
    public IndicatorDTO getOne(@PathVariable("id") Long id) {
        return indicatorQuery.findById(id);
    }

    @GetMapping("/getByType")
    @Override
    public List<IndicatorDTO> getByType(Integer typeIndex) {
        return indicatorQuery.findByType(typeIndex);
    }

    @PostMapping("/choice/add")
    @Override
    public void addChoice(@RequestBody @Validated ChoiceCreate cmd) {
        indicatorApplication.addChoice(cmd);
    }

    @PostMapping("/choice/remove")
    @Override
    public void removeChoice(@RequestBody @Validated ChoiceRemove choiceRemove) {
        indicatorApplication.removeChoice(choiceRemove);
    }
}
