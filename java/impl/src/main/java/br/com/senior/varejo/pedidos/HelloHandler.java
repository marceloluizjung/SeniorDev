package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HelloHandler implements HelloWorld {

    @Override
    public HelloWorldOutput helloWorld(HelloWorldInput request) {
        // TODO Auto-generated method stub
        HelloWorldOutput out =  new HelloWorldOutput();
        out.helloWorldMessage = "Olá Gian";
        return out;
    }

}
