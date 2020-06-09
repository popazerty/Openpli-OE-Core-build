FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://init \
	file://add-sh4.patch \
	file://udev-builtin-input_id.patch \
	"

DEPENDS += " udev-extraconf"
RDEPENDS_${PN} += " udev-extraconf"

do_install_append() {
	install -d ${D}${base_libdir}
	ln -sf libudev.so.1.6.3  ${D}${base_libdir}/libudev.so.0
}
