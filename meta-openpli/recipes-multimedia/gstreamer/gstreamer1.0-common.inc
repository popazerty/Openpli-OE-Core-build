GST_VERSION_FULL = "1.18.2"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "16178d46c87517b79a7be72f538fd726fbdb888f"
SRCREV_gst_libav = "1145015dc12e817c7dea66c7183f204b90558654"

SRCREV_gst_plugins_bad = "50df74ce6004add53f6537f95c69fc52eef3653f"
SRCREV_gst_plugins_base = "98a3329b70fb06da73b1194bf86f770a153ffe66"
SRCREV_gst_plugins_good = "d18ddc2385dd5d22dda6a9b0fbc38bd0e761dcfb"
SRCREV_gst_plugins_ugly = "a9e133420e768f870fb560fa58a60000acae56eb"

S = "${WORKDIR}/git"
