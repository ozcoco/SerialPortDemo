cmake_minimum_required(VERSION 3.4.1)


include_directories(${CMAKE_SOURCE_DIR})

aux_source_directory(${CMAKE_SOURCE_DIR} SRC)

add_library(
        serial_port
        SHARED
        ${SRC})

target_link_libraries(
        serial_port
        log)