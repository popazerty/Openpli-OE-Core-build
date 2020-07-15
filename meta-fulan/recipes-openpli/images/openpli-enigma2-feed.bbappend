OPTIONAL_WIFI_PACKAGES_remove_sh4 += "\
	${@ 'kernel-module-8812au' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.0') < 0) else '' } \
	${@ 'kernel-module-8814au' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.0') < 0) else '' } \
	${@ 'kernel-module-rt5572sta' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '3.10') < 0) else '' } \
	${@ 'kernel-module-rt8188eu' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '3.12') < 0) else '' } \
	${@ 'kernel-module-rt3573sta' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '3.12') < 0) else '' } \
	${@ 'kernel-module-mt7601usta' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.2') < 0) else '' } \
	${@ 'kernel-module-8723a' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.5') < 0) else '' } \
	${@ 'kernel-module-8723bu' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.6') < 0) else '' } \
	${@ 'kernel-module-8192eu' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.7') < 0) else '' } \
	${@ 'kernel-module-mt7610u' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.19') < 0) else '' } \
	\
	${@ 'kernel-module-8821cu' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.0') > 0) else '' } \
	\
	${@bb.utils.contains('MACHINE_ESSENTIAL_EXTRA_RDEPENDS', 'rtl8723bs', '', bb.utils.contains('MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS', 'spycat-rtl8723bs', '', 'kernel-module-r8723bs' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.12') < 0) else '', d), d)} \
	\
	${@ 'kernel-module-88xxau' if ("${KERNEL_VERSION}" and bb.utils.vercmp_string("${KERNEL_VERSION}", '4.0') >= 0) else '' } \
	kernel-module-88x2bu \
	kernel-module-8189es \
	firmware-rtl8723bu \
	firmware-rtl8188eu  \
	firmware-rtl8192eu \
	firmware-mt7601u \
	"
OPTIONAL_PACKAGES_remove_sh4 += "\
	gdb \
	nodejs \
	"

OPTIONAL_PACKAGES_append += "\
	iptraf \
	"
