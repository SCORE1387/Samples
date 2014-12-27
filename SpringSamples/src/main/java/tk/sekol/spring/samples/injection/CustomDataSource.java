package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class CustomDataSource {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomDataSource{" +
            "url='" + url + '\'' +
            ", driverClassName='" + driverClassName + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
