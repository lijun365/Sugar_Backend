package org.freefly.simplesugarmark.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SugarMark implements Serializable {
    private long serialId = 1010101001;
    private Integer id;
    private Boolean status;
    private Integer days;
    private String desc;
    private Date cDate;
    private Date uDate;

    public String getcDate() {
        if(this.cDate == null) return null;
        return new SimpleDateFormat("yyyy-MM-dd").format(cDate);
    }

    public String getuDate() {
        if(this.uDate == null) return null;
        return new SimpleDateFormat("yyyy-MM-dd").format(uDate);
    }

}
