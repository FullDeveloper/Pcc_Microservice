package com.pineconecredit.auth.server.service.impl;

import com.pineconecredit.auth.server.entity.Client;
import com.pineconecredit.auth.server.mapper.ClientMapper;
import com.pineconecredit.auth.server.service.AuthClientService;
import com.pineconecredit.common.exception.auth.ClientInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ZhouRunBin
 * Date: 2018/4/5 0005
 * Time: 2:51
 * Description:
 */
@Service
public class DBAuthClientService implements AuthClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public String apply(String clientId, String secret) throws Exception {
        return null;
    }

    @Override
    public List<String> getAllowedClient(String serviceId, String secret) {
        return null;
    }

    @Override
    public List<String> getAllowedClient(String clientId) {
        Client info = getClient(clientId);
        List<String> clients = clientMapper.selectAllowedClient(clientId);
        if(clients==null) {
            new ArrayList<String>();
        }
        return clients;
    }

    private Client getClient(String clientId, String secret) {
        Client client = new Client();
        client.setCode(clientId);
        client = clientMapper.selectOne(client);
        if(client==null||!client.getSecret().equals(secret)){
            throw new ClientInvalidException("Client not found or Client secret is error!");
        }
        return client;
    }

    private Client getClient(String clientId) {
        Client client = new Client();
        client.setCode(clientId);
        client = clientMapper.selectOne(client);
        return client;
    }

    @Override
    public void registryClient() {

    }

    @Override
    public void validate(String clientId, String secret) throws Exception {

    }
}
