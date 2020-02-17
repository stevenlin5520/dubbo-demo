## Dubbo业余学习放出的源码
## dubbo-demo-api为公共服务的存放模块
## dubbo-demo-provider_api为提供远程服务的模块
## dubbo-demo-consumer_api为调用远程服务的模块
## dubbo-admin为dubbo的管理控制台
## zookeeper-3.4.8为服务注册中心

<br>
<br>
<br>
<br>
-----------------------------dubbo-admin-2.6.0启动报错--------------------------------------------------

Caused by: org.springframework.beans.NotWritablePropertyException: Invalid property 'URIType' of bean class 
[com.alibaba.citrus.service.uribroker.uri.GenericURIBroker]: Bean property 'URIType' is not writable or has 
an invalid setter method. Does the parameter type of the setter match the return type of the getter?

Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name '(inner bean)#25': 
Cannot create inner bean 'server' of type [com.alibaba.citrus.service.uribroker.uri.GenericURIBroker] while setting 
constructor argument; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating 
bean with name 'server': Error setting property values; nested exception is org.springframework.beans.
NotWritablePropertyException: Invalid property 'URIType' of bean class [com.alibaba.citrus.service.uribroker.uri.GenericURIBroker]: 
Bean property 'URIType' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?

Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'server': 
Error setting property values; nested exception is org.springframework.beans.NotWritablePropertyException: Invalid 
property 'URIType' of bean class [com.alibaba.citrus.service.uribroker.uri.GenericURIBroker]: Bean property 'URIType' 
is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?

-----------------------------------------错误解决--------------------------------------------------------
<br>
使用jdk1.7环境启动，正常运行
