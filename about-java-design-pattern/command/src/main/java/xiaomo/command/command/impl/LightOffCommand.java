package xiaomo.command.command.impl;

import lombok.extern.slf4j.Slf4j;
import xiaomo.command.bean.Light;
import xiaomo.command.command.Command;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/7/17 19:39
 * desc  : 关灯命令
 * Copyright(©) 2017 by xiaomo.
 */

@Slf4j
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        log.info("执行关灯的撤销操作");
        light.on();

    }
}
