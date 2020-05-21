FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

RDEPENDS_${PN} = "${PN}-client"
RDEPENDS_${PN}-client = "rpcbind"
RRECOMMENDS_${PN}-client = "kernel-module-nfs kernel-module-exportfs"

CFLAGS_remove_sh4 = "-Wno-error=format-overflow"
