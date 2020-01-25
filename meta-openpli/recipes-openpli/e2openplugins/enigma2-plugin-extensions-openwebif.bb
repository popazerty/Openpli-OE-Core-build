MODULE = "OpenWebif"
DESCRIPTION = "Control your receiver with a browser"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://README;firstline=10;lastline=12;md5=9c14f792d0aeb54e15490a28c89087f7"
PACKAGE_ARCH = "${MACHINE_ARCH}"

DEPENDS = "python-cheetah-native"
RDEPENDS_${PN} = "\
	aio-grab \
	python-cheetah \
	python-compression \
	python-ipaddress \
	python-json \
	python-misc \
	python-numbers \
	python-pprint \
	python-pyopenssl \
	python-shell \
	python-twisted-web \
	python-unixadmin \
	"

inherit gitpkgv
PV = "1+git${SRCPV}"
PKGV = "1+git${GITPKGV}"

require openplugins-distutils.inc

# Just a quick hack to "compile" it
do_compile() {
	cheetah-compile -R --nobackup ${S}/plugin
	python2 -O -m compileall -d ${PLUGINPATH} ${S}/plugin
}

PLUGINPATH = "${libdir}/enigma2/python/Plugins/Extensions/${MODULE}"
do_install_append() {
	install -d ${D}${PLUGINPATH}
	cp -r ${S}/plugin/* ${D}${PLUGINPATH}
	chmod a+rX ${D}${PLUGINPATH}
}

FILES_${PN}-src += "${PLUGINPATH}/controllers/views/*.tmpl ${PLUGINPATH}/controllers/views/*/*.tmpl ${PLUGINPATH}/controllers/views/*/*/*.tmpl"
FILES_${PN} = "${PLUGINPATH}"
