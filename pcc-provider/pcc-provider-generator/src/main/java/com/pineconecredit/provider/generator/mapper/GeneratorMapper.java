package com.pineconecredit.provider.generator.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 10:58
 * Description:
 */
public interface GeneratorMapper {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

}
