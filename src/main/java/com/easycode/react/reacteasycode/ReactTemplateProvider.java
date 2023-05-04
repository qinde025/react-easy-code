package com.easycode.react.reacteasycode;


import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

/**
 * @author qinde
 * @date 2023/4/28
 */
public class ReactTemplateProvider extends TemplateContextType {

    protected ReactTemplateProvider() {
        super("REACT", "React");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String name = templateActionContext.getFile().getName();
        return name.endsWith(".js") || name.endsWith(".jsx") || name.endsWith(".html")
            || name.endsWith(".ts") || name.endsWith(".tsx");
    }
}
