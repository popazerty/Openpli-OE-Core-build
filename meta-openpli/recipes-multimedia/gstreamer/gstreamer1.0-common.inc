GST_VERSION_FULL = "1.18.3"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "41999d974eab5ccbad4ae6eb32d61efc852e9b13"
SRCREV_gst_libav = "7d72dbe6b95fdfebfd2a737765b963e1a6dc27fd"

SRCREV_gst_plugins_bad = "1b0f035325ac4c54aa3900fd2281fef9ccd40e6a"
SRCREV_gst_plugins_base = "b62278bcfdec932202ba41a2988e24a0f6d9bcb0"
SRCREV_gst_plugins_good = "5486a60e245493190b5b3feda1839f55a5c0e011"
SRCREV_gst_plugins_ugly = "555ecf28e2ee3c96ed1a0a0dbd8705fa535987ef"

S = "${WORKDIR}/git"
