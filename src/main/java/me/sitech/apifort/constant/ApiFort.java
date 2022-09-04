package me.sitech.apifort.constant;

import me.sitech.apifort.config.AppLifecycleBean;

public final class ApiFort {


    public static final String CAMEL_HTTP_PATH_HEADER = "CamelHttpPath";
    public static final String CAMEL_HTTP_METHOD_HEADER = "CamelHttpMethod";

    public static final String API_KEY_HEADER = "x-api-key";
    public static final String API_TOKEN_ROLES = "x-token-roles";

    public static final String API_FORT_JWT_TOKEN_PREFIX = "Bearer ";
    public static final String API_FORT_EMPTY_STRING = "";

    public static final String EXTRACT_CONTEXT_REGEX = String.format("(?s)(?<=/%s/|/%s/).*?(?=/)",
            AppLifecycleBean.getPublicContext(),AppLifecycleBean.getPrivateContext());


}
