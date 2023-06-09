import ProjectDescription

let depencies = Dependencies(
    swiftPackageManager: SwiftPackageManagerDependencies([
        // RxSwift
        .remote(
            url: "https://github.com/ReactiveX/RxSwift.git",
            requirement: .upToNextMajor(from: "6.5.0")
        ),
        // SnapKit
        .remote(
            url: "https://github.com/SnapKit/SnapKit.git",
            requirement: .upToNextMajor(from: "5.0.1")
        ),
        // Then
        .remote(
            url: "https://github.com/devxoul/Then.git",
            requirement: .upToNextMajor(from: "3.0.0")
        ),
        // Moya
        .remote(
            url: "https://github.com/Moya/Moya.git",
            requirement: .upToNextMajor(from: "15.0.0")
        ),
        // KeychainSwift
        .remote(
            url: "https://github.com/evgenyneu/keychain-swift.git",
            requirement: .upToNextMajor(from: "20.0.0")
        ),
        // Kingfisher
        .remote(
            url: "https://github.com/onevcat/Kingfisher.git",
            requirement: .upToNextMajor(from: "7.4.1")
        )
    ]),
    platforms: [.iOS]
)
