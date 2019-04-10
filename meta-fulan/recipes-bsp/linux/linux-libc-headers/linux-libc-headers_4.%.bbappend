FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# sh4 boxes require some headers from the kernel modules (for the frameb

SRC_URI_append_sh4 = "\
    file://fsxattr.patch \
    file://dmx_set_source.patch \
    file://stmfb.h \
    file://stm_ioctls.h \
    file://bpamem.h \
    file://st-coprocessor.h \
"

do_install_append_sh4() {
    install -d ${D}/${includedir}/linux/dvb
    install -m 644 ${WORKDIR}/stm_ioctls.h ${D}/${includedir}/linux/dvb
    install -m 644 ${WORKDIR}/stmfb.h ${D}/${includedir}/linux
    install -m 644 ${WORKDIR}/bpamem.h ${D}/${includedir}
    install -m 644 ${S}/include/uapi/linux/usb/video.h ${D}${includedir}/linux/usb/video.h
}
