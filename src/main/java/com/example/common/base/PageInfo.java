package com.example.common.base;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.annotation.sql.DataSourceDefinition;

@Data
@Accessors(chain = true)
public class PageInfo {
    private long page = Constants.DEFAULT_PAGE_INDEX;
    private long size = Constants.DEFAULT_PAGE_SIZE;
    private Long total;
}
