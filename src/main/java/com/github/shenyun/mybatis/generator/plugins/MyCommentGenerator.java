package com.github.shenyun.mybatis.generator.plugins;

import java.util.Properties;
import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * Created by yong.luo on 2016/6/21.
 */
public class MyCommentGenerator implements CommentGenerator {
    private Properties properties = new Properties();
    private boolean suppressDate = false;
    private boolean suppressAllComments = false;

    public MyCommentGenerator() {
    }

    public void addConfigurationProperties(Properties properties) {
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if(!this.suppressAllComments && introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            field.addJavaDocLine(" */");
        }

    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    }

    /**
     * 1.3.3新加的接口
     * @param topLevelClass
     * @param introspectedTable
     */
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
    }

    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    public void addComment(XmlElement xmlElement) {
    }

    public void addRootComment(XmlElement rootElement) {
    }
}
