package demo.lib.utils;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.util.StringUtils;

import com.vaadin.spring.annotation.SpringComponent;

@SpringComponent
@Scope("prototype")
public class I18n {

    private Locale locale;
    private MessageSource messageSource;

    // Public API
    // ------------------------------------------------------------------------
    public String get(String key) {
        Object[] args = null;

        return get(key, args);
    }

    public String get(String key, Object[] args) {
        try {
            if (messageSource == null) {
                setupMessageSource();
            }

            String message = messageSource.getMessage(key, args, getLocale());

            if (StringUtils.isEmpty(message)) {
                return key;
            }

            return message;
        } catch (Exception e) {
            Log.warning(getClass(), String.format("Unable to find i18n key: %s", key));

            return key;
        }
    }


    public String get(String key, Locale locale) {
        setLocale(locale);

        return get(key);
    }

    public String get(String key, Locale locale, Object[] args) {
        setLocale(locale);

        return get(key, args);
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        if (locale != null) {
            return locale;
        } else {
            return Locale.getDefault();
        }
    }

    // Private utils
    // ------------------------------------------------------------------------
    private void setupMessageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

        messageSource.setBasename("i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");

        this.messageSource = messageSource;
    }
}