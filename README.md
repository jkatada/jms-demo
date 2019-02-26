# JMS-demo

1. ActiveMQをインストール

2. `http://localhost:8161/admin`へアクセス (admin/admin)

3. "TodoMessageQueue"というキューと、"TodoMessageTopic"というTopicを作る

4. Tomcatのcontext.xmlに下記を追加
   ```xml
    <Resource name="jms/ConnectionFactory" auth="Container"
        type="org.apache.activemq.ActiveMQConnectionFactory"
        description="JMSConnectionFactory"
        factory="org.apache.activemq.jndi.JNDIReferenceFactory"
        brokerURL="tcp://localhost:61616?jms.redeliveryPolicy.maximumRedeliveries=1"
        brokerName="ActiveMQBroker" useEmbeddedBroker="false"/>

    <Resource name="jms/queue/TodoMessageQueue"
        auth="Container"
        type="org.apache.activemq.command.ActiveMQQueue"
        factory="org.apache.activemq.jndi.JNDIReferenceFactory"
        physicalName="TodoMessageQueue"/>
    
    <Resource name="jms/topics/TodoMessageTopic"
        auth="Container"
        type="org.apache.activemq.command.ActiveMQTopic"
        factory="org.apache.activemq.jndi.JNDIReferenceFactory"
        physicalName="TodoMessageTopic"/>
    ```
    
5. `http://localhost:8080/jms-demo`にアクセス
