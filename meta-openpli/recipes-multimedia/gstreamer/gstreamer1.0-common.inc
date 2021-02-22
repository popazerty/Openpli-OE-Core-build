GST_VERSION_FULL = "1.18.3"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "f90e9a71ddd0015a250400ef35bbed3dd5cda1a8"
SRCREV_gst_libav = "aacec2cf3c58f5ee416be6a2e93e922b2baea898"

SRCREV_gst_plugins_bad = "a4a2f65dfabc41a2e24a79294fd019c4d6dac4c6"
SRCREV_gst_plugins_base = "788b00419aa749812410af8d7eeccc8d398b8abd"
SRCREV_gst_plugins_good = "3e79f901303282d4c4009c6d8ce55b7485787132"
SRCREV_gst_plugins_ugly = "555ecf28e2ee3c96ed1a0a0dbd8705fa535987ef"

S = "${WORKDIR}/git"
