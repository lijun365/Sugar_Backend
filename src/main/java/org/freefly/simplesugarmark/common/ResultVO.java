package org.freefly.simplesugarmark.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.freefly.simplesugarmark.bean.SugarMark;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {
    private int total;
    private int code = 200;
    private List<SugarMark> list;
}
