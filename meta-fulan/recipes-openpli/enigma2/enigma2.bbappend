CXXFLAGS_append += " -std=c++11 -fPIC -fno-strict-aliasing "


PYTHON_RDEPS_append_sh4 += "\
	python-requests \
	"

SRC_URI_sh4 = "${GITHUB_URI}/kueken/openpli-enigma2.git;branch=${ENIGMA2_BRANCH}"