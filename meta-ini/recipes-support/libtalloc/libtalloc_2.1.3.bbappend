FILESEXTRAPATHS_append := "${THISDIR}/files:"

SRC_URI_append_xpeedlx = " \
    file://talloc_old_kernel_fix.patch;patch=1 \
    "

