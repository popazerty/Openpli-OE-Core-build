SUMMARY = "pyLoad is a fast, lightweight and full featured download manager for many One-Click-Hoster"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.MD;md5=d4333f07cbfa8fe036e90820f556b2ad"
HOMEPAGE = "http://pyload.org/"
RDEPENDS_${PN} = "\
  python-compression \
  python-db \
  python-email \
  python-html \
  python-imaging \
  python-numbers \
  python-pprint \
  python-pycrypto \
  python-pycurl \
  python-sqlite3 \
  python-subprocess \
  python-terminal \
  python-unixadmin \
  python-xmlrpc \
"
RRECOMMENDS_${PN} = "unrar"

PV = "0.4.20"

inherit update-rc.d

SRC_URI = "https://github.com/pyload/pyload/archive/${PV}.tar.gz \
  file://pyload.init \
  file://pyload.tar.gz.defaults"
SRC_URI[md5sum] = "7c2bfc77fe54008ac01ecf5b6be4ea85"
SRC_URI[sha256sum] = "438f9a2fc8ecb13b75f55b00192a2192c96a0a08ec1ae842cea17c7c49aab500"

S = "${WORKDIR}/pyload-${PV}"

FILES_${PN} = "/usr/pyload/* /etc/*"

INITSCRIPT_NAME = "${PN}"
INITSCRIPT_PARAMS = "defaults 60 "

do_compile() {
    python -m compileall ${S}
}

do_install() {
    install -d ${D}/etc/init.d
    install -d ${D}/usr/pyload

    cp -r ${S}/icons ${D}/usr/pyload
    cp -r ${S}/locale ${D}/usr/pyload
    cp -r ${S}/module ${D}/usr/pyload
    cp -r ${S}/scripts ${D}/usr/pyload
    install -m 755 ${S}/pyLoadCli.py ${D}/usr/pyload
    install -m 755 ${S}/pyLoadCore.py ${D}/usr/pyload
    install -m 755 ${S}/systemCheck.py ${D}/usr/pyload
    cp ${WORKDIR}/pyload.tar.gz.defaults ${D}/usr/pyload/pyload-defaults.tar.gz
    
    install -m 0755 ${WORKDIR}/pyload.init ${D}/etc/init.d/pyload
}

