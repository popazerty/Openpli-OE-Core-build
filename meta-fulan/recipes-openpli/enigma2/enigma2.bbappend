SRC_URI_sh4 = "${GITHUB_URI}/kueken/openpli-enigma2.git;branch=${ENIGMA2_BRANCH}"

DEPENDS_append_sh4 = " \
	libmme-image libmme-host \
	"

RDEPENDS_${PN}_append_sh4 = " \
	libmme-host \
	"

EXTRA_OECONF_append_sh4 = "\
	--enable-${MACHINE} --with-lcd \
	"

PYTHON_RDEPS_append_sh4 = " \
	python-requests \
	"

