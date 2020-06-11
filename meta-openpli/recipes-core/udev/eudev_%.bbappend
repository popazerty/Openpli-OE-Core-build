FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://init \
	file://add-sh4.patch \
	"

DEPENDS += " udev-extraconf"
RDEPENDS_${PN} += " udev-extraconf"
