module org.audiveris.proxymusic {
    requires slf4j.api;
    requires jakarta.xml.bind;

    exports org.audiveris.proxymusic;
    opens org.audiveris.proxymusic;

    exports org.audiveris.proxymusic.mxl;
    opens org.audiveris.proxymusic.mxl;

    exports org.audiveris.proxymusic.util;
    opens org.audiveris.proxymusic.util;
}
