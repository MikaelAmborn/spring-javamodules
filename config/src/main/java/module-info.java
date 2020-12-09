module javamodules.config {
    requires spring.context;
    requires spring.beans;
    requires javamodules.common;
    exports com.hivestreaming.config;
}
