DESCRIPTION = "Allows to list directory"
MAINTAINER = "samsamsam"

require conf/license/openpli-gplv2.inc

inherit gitpkgv

PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"
PR = "r2"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/e2iplayer/e2ibox.git;branch=master"

S = "${WORKDIR}/git/"

SOURCE_FILES = "src/main.c"
SOURCE_FILES =+ "src/lsdir.c"
SOURCE_FILES =+ "src/lsdir.h"
SOURCE_FILES =+ "src/cmdwrapper.c"
SOURCE_FILES =+ "src/cmdwrapper.h"

do_compile() {
    ${CC} ${SOURCE_FILES} -D_FILE_OFFSET_BITS=64 -D_LARGEFILE64_SOURCE=1 -D_LARGEFILE_SOURCE -I${S}/src -I${D}/${libdir} -I${D}/${includedir} -o cmdwrap ${LDFLAGS}
    ${CC} ${SOURCE_FILES} -D_FILE_OFFSET_BITS=64 -D_LARGEFILE64_SOURCE=1 -D_LARGEFILE_SOURCE -I${S}/src -I${D}/${libdir} -I${D}/${includedir} -o lsdir ${LDFLAGS}
    ${CC} ${SOURCE_FILES} -D_FILE_OFFSET_BITS=64 -D_LARGEFILE64_SOURCE=1 -D_LARGEFILE_SOURCE -I${S}/src -I${D}/${libdir} -I${D}/${includedir} -o nice ${LDFLAGS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/cmdwrap ${D}${bindir}
    install -m 0755 ${S}/nice ${D}${bindir}
    install -m 0755 ${S}/lsdir ${D}${bindir}
}
