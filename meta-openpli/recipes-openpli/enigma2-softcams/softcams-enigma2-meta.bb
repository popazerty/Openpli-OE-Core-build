DESCRIPTION = "meta file for enigma2 softcam packages"

require conf/license/openpli-gplv2.inc

PROVIDES = "softcams"

# mipsel only binary softcams
DEPENDS_append_mipsel = "\
	enigma2-plugin-softcams-cccam \
	enigma2-plugin-softcams-cccam209 \
	enigma2-plugin-softcams-cccam221 \
	enigma2-plugin-softcams-cccam230 \
	enigma2-plugin-softcams-rqcamd \
	enigma2-plugin-softcams-mgcamd \
	"

# armv7 obly binary softcams
DEPENDS_append_armv7 += " \
	enigma2-plugin-softcams-cccam \
	enigma2-plugin-softcams-mgcamd \
	"

# softcams with source available
DEPENDS += " \
	enigma2-plugin-softcams-oscam \
	enigma2-plugin-softcams-oscam-emu \
	"
