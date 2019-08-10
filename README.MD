### spring bean lifecycle

1. instance 
2. populate property
3. XXXAware
    1. BeanNameAware
    1. BeanFactoryAware
    1.   
4. BeanPostProcessor#beforeInitialization
4.InitializingBean#afterPropertiesSet
4.custom init method
4. BeanPostProcessor#afterInitialization
6 custom destroy @PreDestroy
7 application#close call DisposableBean




@PointCut not work 用了 @Bean(initMethod="",destroyMethod="")


