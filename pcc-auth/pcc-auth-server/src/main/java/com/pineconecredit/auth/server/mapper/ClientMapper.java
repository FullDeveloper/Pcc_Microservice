package com.pineconecredit.auth.server.mapper;

import com.pineconecredit.auth.server.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClientMapper extends Mapper<Client> {

    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
}