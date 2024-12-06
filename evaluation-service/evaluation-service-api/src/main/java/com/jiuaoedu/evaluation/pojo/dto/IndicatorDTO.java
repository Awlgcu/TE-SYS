package com.jiuaoedu.evaluation.pojo.dto;

import com.jiuaoedu.share.Command;

import java.awt.*;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/3 14:23
 * @version: 1.0
 */

public class IndicatorDTO implements Command {
    private String description;

    private String type;

    private String choices;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }
}
