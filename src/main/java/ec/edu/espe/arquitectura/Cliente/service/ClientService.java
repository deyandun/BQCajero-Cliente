package ec.edu.espe.arquitectura.Cliente.service;

import ec.edu.espe.arquitectura.Cliente.soap.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
@Slf4j
@RequiredArgsConstructor
@Component("Cliente")
public class ClientService extends WebServiceGatewaySupport {

    public String endpoint = "http://localhost:8080/ws/login.wsdl";

    public String echo(){
        return "echo";
    }

    public LoginResponse login(LoginSerializer loginSerializer){
        LoginRequest request = new LoginRequest();
        request.setUsername(loginSerializer);
        LoginResponse response = (LoginResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }

    public CreateResponse create(UserCreationSerializer userCreationSerializer){
        CreateRequest request = new CreateRequest();
        request.setUserCreation(userCreationSerializer);
        CreateResponse response = (CreateResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }

    public RemoveResponse remove(Long id){
        RemoveRequest request = new RemoveRequest();
        request.setId(id);
        RemoveResponse response = (RemoveResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }


}
