RPROVIDES_libcrypto10 ="libcrypto"
RPROVIDES_libssl10 ="libssl"
RPROVIDES_openssl-conf10 ="openssl-conf"
RPROVIDES_${PN} ="openssl"

PROVIDES += "libcrypto libssl openssl-conf openssl"

openssl_package_preprocess () {
    :
}
