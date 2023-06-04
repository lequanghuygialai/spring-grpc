package com.example.client.services;


import com.example.grpc.HelloRequest;
import com.example.grpc.HelloServiceGrpc.HelloServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @GrpcClient("grpc-client")
    private HelloServiceBlockingStub helloServiceStub;

    public String receiveGreeting(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return helloServiceStub.hello(request).getGreeting();
    }
}
