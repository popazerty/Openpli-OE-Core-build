GST_VERSION_FULL = "1.18.2"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "16178d46c87517b79a7be72f538fd726fbdb888f"
SRCREV_gst_libav = "b08d11fb172683822e33a21de5ec0105bc214654"

SRCREV_gst_plugins_bad = "a35760806abf4196c6b1b58ff808ba6302c7fd61"
SRCREV_gst_plugins_base = "3082472979235a56032a40fa5ce07eb76bc7c746"
SRCREV_gst_plugins_good = "d432ca10df4f5f311449e5433cd815770923cd4e"
SRCREV_gst_plugins_ugly = "a9e133420e768f870fb560fa58a60000acae56eb"

S = "${WORKDIR}/git"
