package com.jiuaoedu.evaluation.api;

import com.jiuaoedu.evaluation.pojo.cmd.ChoiceCreate;
import com.jiuaoedu.evaluation.pojo.cmd.ChoiceRemove;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorCreate;
import com.jiuaoedu.evaluation.pojo.cmd.IndicatorModify;
import com.jiuaoedu.evaluation.pojo.dto.IndicatorDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.*;
import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:58
 * @version: 1.0
 */

@RequestMapping("/indicator")
public interface IndicatorApi {
    @PostMapping("/create")
    void create(@RequestBody @Validated IndicatorCreate cmd);

    @PostMapping("/modify")
    void modify(@RequestBody @Validated IndicatorModify cmd);

    @DeleteMapping("/delete")
    void delete(@RequestParam @NotNull Long id);

    @GetMapping("/getAll")
    List<IndicatorDTO> getAll();

    @GetMapping("/get/{id}")
    IndicatorDTO getOne(@PathVariable("id") Long id);

    @GetMapping("getByType")
    List<IndicatorDTO> getByType(@RequestParam @NotNull Integer typeIndex);

    @PostMapping("/choice/add")
    void addChoice(@RequestBody @Validated ChoiceCreate cmd);

    @PostMapping("/choice/remove")
    void removeChoice(@RequestBody @Validated ChoiceRemove choiceRemove);
}
