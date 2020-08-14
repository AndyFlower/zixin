### 一、使用Intellij创建一个空的springboot项目

![image-20200814132829897](.\images\image-20200814132829897.png)

### 二、整合mybatis-plus

- 添加依赖

  ```xml
  <dependency>
  			<groupId>com.baomidou</groupId>
  			<artifactId>mybatis-plus-boot-starter</artifactId>
  			<version>3.2.0</version>
  		</dependency>
  		<dependency>
  			<groupId>com.baomidou</groupId>
  			<artifactId>mybatis-plus-generator</artifactId>
  			<version>3.2.0</version>
  		</dependency>
  		<dependency>
  			<groupId>com.oracle</groupId>
  			<artifactId>ojdbc6</artifactId>
  			<version>11.2.0.3</version>
  		</dependency>
  		<dependency>
  			<groupId>org.springframework.boot</groupId>
  			<artifactId>spring-boot-starter-log4j</artifactId>
  			<exclusions>
  				<exclusion>
  					<groupId>org.slf4j</groupId>
  					<artifactId>slf4j-log4j12</artifactId>
  				</exclusion>
  			</exclusions>
  		</dependency>
  		<dependency>
  			<groupId>org.freemarker</groupId>
  			<artifactId>freemarker</artifactId>
  			<version>2.3.28</version>
  		</dependency>
  		<dependency>
  			<groupId>com.alibaba</groupId>
  			<artifactId>fastjson</artifactId>
  			<version>1.2.47</version>
  		</dependency>
  		<dependency>
  			<groupId>org.projectlombok</groupId>
  			<artifactId>lombok</artifactId>
  			<version>1.16.10</version>
  		</dependency>
  ```

- 分页插件

  ```java
  package com.slp.forme.util;
  
  import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  import org.springframework.transaction.annotation.EnableTransactionManagement;
  
  /**
   * @ClassName MybatsPlusConfig
   * @Description TODO
   * @Author sanglp
   * @Date 2020/8/14 14:31
   * @Version 1.0
   **/
  @Configuration
  @EnableTransactionManagement
  public class MybatsPlusConfig {
      @Bean
      public PaginationInterceptor paginationInterceptor(){
          return new PaginationInterceptor();
      }
  }
  
  ```

  

- 基础代码生成器

  ```java
  package com.slp.forme.util;
  
  import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
  import com.baomidou.mybatisplus.core.toolkit.StringUtils;
  import com.baomidou.mybatisplus.generator.AutoGenerator;
  import com.baomidou.mybatisplus.generator.config.*;
  import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
  import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
  
  import java.util.Scanner;
  
  /**
   * @ClassName GeneratorCodeConfig
   * @Description TODO
   * @Author sanglp
   * @Date 2020/8/14 15:14
   * @Version 1.0
   **/
  public class GeneratorCodeConfig {
      public static String scanner(String tip) {
          Scanner scanner = new Scanner(System.in);
          StringBuilder help = new StringBuilder();
          help.append("请输入" + tip + "：");
          System.out.println(help.toString());
          if (scanner.hasNext()) {
              String ipt = scanner.next();
              if (StringUtils.isNotEmpty(ipt)) {
                  return ipt;
              }
          }
          throw new MybatisPlusException("请输入正确的" + tip + "！");
      }
  
      public static void main(String[] args) {
          // 代码生成器
          AutoGenerator mpg = new AutoGenerator();
  
          // 全局配置
          GlobalConfig gc = new GlobalConfig();
          String projectPath = System.getProperty("user.dir");
          gc.setOutputDir(projectPath + "/src/main/java");
          gc.setAuthor("sanglp");
          gc.setOpen(false);
          //实体属性 Swagger2 注解
          gc.setSwagger2(false);
          mpg.setGlobalConfig(gc);
  
          // 数据源配置
          DataSourceConfig dsc = new DataSourceConfig();
          dsc.setUrl("jdbc:oracle:thin:culsite/culsite@192.168.2.58:1521:LOYUTFDB2");
          dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
          dsc.setUsername("culsite");
          dsc.setPassword("culsite");
          mpg.setDataSource(dsc);
  
          // 包配置
          PackageConfig pc = new PackageConfig();
  //        pc.setModuleName(scanner("模块名"));
          pc.setParent("com.slp.forme");
          pc.setEntity("entity.auto");
          pc.setMapper("mapper.auto");
          pc.setService("service");
          pc.setServiceImpl("service.impl");
          mpg.setPackageInfo(pc);
  
          // 自定义配置
  //        InjectionConfig cfg = new InjectionConfig() {
  //            @Override
  //            public void initMap() {
  //                // to do nothing
  //            }
  //        };
  
          // 如果模板引擎是 freemarker
  //        String templatePath = "/templates/mapper.xml.ftl";
          // 如果模板引擎是 velocity
          // String templatePath = "/templates/mapper.xml.vm";
  
          // 自定义输出配置
  //        List<FileOutConfig> focList = new ArrayList<>();
          // 自定义配置会被优先输出
  //        focList.add(new FileOutConfig(templatePath) {
  //            @Override
  //            public String outputFile(TableInfo tableInfo) {
  //                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
  //                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
  //                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
  //            }
  //        });
          /*
          cfg.setFileCreate(new IFileCreate() {
              @Override
              public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                  // 判断自定义文件夹是否需要创建
                  checkDir("调用默认方法创建的目录");
                  return false;
              }
          });
          */
  //        cfg.setFileOutConfigList(focList);
  //        mpg.setCfg(cfg);
  
          // 配置模板
          TemplateConfig templateConfig = new TemplateConfig();
  
          // 配置自定义输出模板
          //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
          // templateConfig.setEntity("templates/entity2.java");
          // templateConfig.setService();
          // templateConfig.setController();
  
          templateConfig.setXml(null);
          mpg.setTemplate(templateConfig);
  
          // 策略配置
          StrategyConfig strategy = new StrategyConfig();
          strategy.setNaming(NamingStrategy.underline_to_camel);
          strategy.setColumnNaming(NamingStrategy.underline_to_camel);
          //strategy.setSuperEntityClass("com.baomidou.mybatisplus.extension.activerecord.Model");
          strategy.setEntityLombokModel(true);
          strategy.setRestControllerStyle(true);
  
          strategy.setEntityLombokModel(true);
          // 公共父类
  //        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
          // 写于父类中的公共字段
  //        strategy.setSuperEntityColumns("id");
          strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
          strategy.setControllerMappingHyphenStyle(true);
          strategy.setTablePrefix(pc.getModuleName() + "_");
          mpg.setStrategy(strategy);
          mpg.setTemplateEngine(new FreemarkerTemplateEngine());
          mpg.execute();
      }
  }
  ```

  

- 

  