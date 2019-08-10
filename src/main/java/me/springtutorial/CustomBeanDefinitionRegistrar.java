package me.springtutorial;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Create by songwenchao on 2019-07-20
 */
public class CustomBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Lions.class);
    registry.registerBeanDefinition("lions",beanDefinition);
  }
}
