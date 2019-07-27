inherit upx-compress

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://include_stdint.h_explicitly_for___kernel_ulong_t.patch"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE_FEATURES", "oldkernel", "file://iproute2_oldkernel.patch", "", d)} \
	"
