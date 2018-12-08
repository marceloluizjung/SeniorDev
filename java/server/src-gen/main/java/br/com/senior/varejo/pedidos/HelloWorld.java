/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name="helloWorld", kind=CommandKind.Query, requestPrimitive="helloWorld", responsePrimitive="helloWorldResponse")
public interface HelloWorld extends MessageHandler {
    
    public HelloWorldOutput helloWorld(HelloWorldInput request);
    
}
