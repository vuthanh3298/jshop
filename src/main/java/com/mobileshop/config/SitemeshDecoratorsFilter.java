package com.mobileshop.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * SitemeshDecoratorsFilter
 */
public class SitemeshDecoratorsFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/admin*", "/WEB-INF/decorators/AdminDecorator.jsp")
        		
                .addDecoratorPath("/*", "/WEB-INF/decorators/WebDecorator.jsp")
                .addExcludedPath("/api*");
    }
}