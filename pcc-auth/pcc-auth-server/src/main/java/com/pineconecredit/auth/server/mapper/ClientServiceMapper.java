package com.pineconecredit.auth.server.mapper;

import com.pineconecredit.auth.server.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}