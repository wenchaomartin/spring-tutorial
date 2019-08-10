package me.springtutorial;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Create by songwenchao on 2019-07-20
 */
public class CustomSelector implements ImportSelector {
  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    System.out.println(importingClassMetadata.getClassName());
    return new String[]{"me.springtutorial.Mouse"};
  }
}
