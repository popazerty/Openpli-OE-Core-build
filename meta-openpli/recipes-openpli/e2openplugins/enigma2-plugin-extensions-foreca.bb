MODULE = "Foreca"
DESCRIPTION = "Weather forecast for the upcoming 10 days"
RDEPENDS_${PN} = "python-html"

inherit gitpkgv
PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"
PR = "r0"

require conf/license/license-gplv2.inc
require openplugins-distutils.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append = " file://0001-update-from-jack2015.patch"

FILES_${PN} += "${sysconfdir}/enigma2/Foreca"
CONFFILES_${PN} = "${sysconfdir}/enigma2/Foreca/City.cfg ${sysconfdir}/enigma2/Foreca/Filter.cfg"
