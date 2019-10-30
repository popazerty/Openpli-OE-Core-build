DESCRIPTION = "MME image library"

DEPENDS += " fulan-dvb-modules-${MACHINE}"

require ddt-apps.inc

FILES_${PN} += "${libdir}/libmme_host.so"
FILES_${PN}-dev = "${libdir}/libmme_host.la"

INSANE_SKIP_${PN} += "dev-so"
