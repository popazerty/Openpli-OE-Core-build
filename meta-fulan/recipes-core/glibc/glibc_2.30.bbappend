FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

SRC_URI += " file://0001-ptrace-protect-ptrace_peeksiginfo_args-from-redefint.patch \
             file://0002-fix-build-for-old-libcheader.patch \
             file://0003-glibc-c-utf8-locale.patch \
"
SRC_URI_append_sh4 += "\
    file://glibc-fix-with-old-kernel.patch \
    file://sh4-trap.patch \
"

SSTATE_DUPWHITELIST += "${STAGING_INCDIR}/netatalk/at.h ${STAGING_INCDIR}/scsi/scsi_ioctl.h ${STAGING_INCDIR}/scsi/sg.h"
