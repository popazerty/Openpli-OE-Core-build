FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI_append_sh4 += "\
    file://glibc-fix-with-old-kernel.patch \
    file://sh4-trap.patch \
    file://110-sh-fix-gcc6.patch \
"
